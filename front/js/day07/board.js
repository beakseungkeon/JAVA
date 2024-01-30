btn.onclick = function(){
    //입력한 제목, 내용, 작성자를 가져옴
    let title = document.getElementById("title").value;
    let content = document.getElementById("content").value;
    let writer = document.getElementById("writer").value;
    let modal=document.querySelector(".model-box");
    //가져온 제목, 내용, 작성자와 번호(계산),조회수(0)를 이용해서 객체를 생성
    let num;
    if(!list.length){
        num = 1;
    }else{
        num = parseInt(list[0]["num"]) + 1;
    }
    let view = 0;
    let obj = {
        num,
        title,//title : title
        writer,
        view,
        content
    }
    if(!checkBoard(obj)){
        alert("모든 항목은 필수 항목입니다.");
        return false;
    }
    //생성된 객체를 배열에 앞에 추가
    list.unshift(obj);
    //display함수를 호출 : 테이블에 list를 출력하는 함수
    display(list);
    //입력값들을 비워줌
    initForm();
    //return false를 통해 서버로 전송되는 것을 막아줌
    return false;
}
function getBoard(list,num){
    for(board of list){
        if(board["num"]==num){
            return board;
        }
    }
    return null;
}

function linkClick(){
    modal.style.display="block"
    let num=this.getAttribute("data-num");
    let board = getBoard(list,num);
    let modalIn=modal.querySelector(".inner-box.content-box");
    
    if(board){
        ++board["view"];
        //번호,제목,작성자,조회수,내용을 구성 후 모달창에 출력
        let html=
        `
        <h1>게시글 상세</h1>
        <div class="input-box">
        <label  class="label">제목:</label>
        <input type="text" name="title"  class="input" readonly  value="${baord.title}">
        </div>
        <div class="input-box">
            <label  class="label">작성자:</label>
            <input type="text" name="writer"  class="input" readonly value="${board.writer}">
        </div>
        <div class="input-box">
            <label  class="label">번호:</label>
            <input type="text" name="num"  class="input" readonly value="${board.num}">
        </div>
        <div class="input-box">
            <label  class="label">조회수:</label>
            <input type="text" name="view"  class="input" readonly value="${board.view}">
        </div>
        <div class="input-box">
            <label  class="label">내용:</label>
            <textarea name="content"  rows="10" class="input text-area" readonly >${borad.content}</textarea>
        </div>
        `;
        
        modalIn.innerHTML=html;
    }else{
        //없는 게시글입니다를 구성해 모달창에 출력
        modal.innerHTML="<h1>없는 게시글입니다.</h1>";

    }
    
    
}
closeBtn.onclick=function(){
    
    modal.style.display="none"
    display(list);
}

//display 함수
function display(list){
    //tbody에 있는 tr태그들을 제거
    let tbody = document.querySelector("tbody");
    tbody.innerHTML = "";
    //list가 비어 있으면
    if(!list.length){
        //tr태그 생성
        let tr = createElement("tr");
        //th태그 생성. 등록된 게시글이 없습니다. colspan="4"
        let th = createElement("th","등록된 게시글이 없습니다", {colspan : 4});
        //tr태그에 th태그를 추가
        tr.append(th);
        //tbody태그에 tr태그를 추가
        tbody.append(tr);
        return;
    }
        
    //list가 비어 있지 않으면 
    //반복문 : list 전체를
    for(let i = 0; i<list.length; i++){
        //tr태그 생성
        let tr = createElement("tr");
        //반복문 : list[i] 객체를 반복문으로 속성값을 꺼냄, for in
        for(let key in list[i]){
            console.log(list[i])
            if(key == "content"){
                continue;
            }
            let obj = list[i];
            if(key != "title"){
                //td태그 생성
                let td = createElement("td", String(obj[key]), {class : key});
                //tr태그에 추가
                tr.append(td);
            }else{
                //td태그 생성
                let td = createElement("td", null, {class : key});
                //a태그 생성
                let attr={
                    class:"link",
                    href : "#",
                    "data-num":obj["num"]
                }
                let a = createElement("a", String(obj[key]), attr);
                a.onclick = linkClick;
                //td태그에 a태그 추가
                td.append(a);
                tr.append(td);
            }
        }
        //tbody태그에 tr태그를 추가
        tbody.append(tr);
    }
}
function createElement(tagName, text, attributes){
    let element = document.createElement(tagName);
    if(text){
        let textNode = document.createTextNode(text);
        element.append(textNode);
    }
    if(attributes){
        for(key in attributes){
            let attrNode = document.createAttribute(key);
            attrNode.value = attributes[key];
            element.setAttributeNode(attrNode);
        }
    }
    return element;
}

//게시글에 빈 항목이 있는지 없는지 알려주는 함수
function checkBoard(board){
    if(!board){
        return false;
    }
    if(typeof board != "object"){
        return false;
    }
    //제목체크
    if(!board["title"].trim().length){
        return false;
    }
    //작성자체크
    if(!board["writer"].trim().length){
        return false;
    }
    //내용 체크
    if(!board["content"].trim().length){
        return false;
    }
    return true;
}
//form태그의 입력값들을 초기화하는 함수
function initForm(){
    document.getElementById("title").value = "";
    document.getElementById("content").value = "";
    document.getElementById("writer").value = "";
}