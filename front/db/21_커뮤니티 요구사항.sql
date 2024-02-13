/*
커뮤니티 사이트를 구축ㅎ기 위한 요구사항
사용자(회원+비회원)
-게시글 목록 조회
	-사용자는 게시글을 제한없이 조회할 수 있다.
	-사용자는 커뮤니티를 선택하여 선택한 커뮤니티에 등록된 게시글들을 조회할 수 있다.
    -사용자는 원하는 검색어를 입력해서 게시글을 조회할 수 있다.
		-검색어가 제목 또는 내용에 포함된 게시글을 조회한다.
	-사용자는 게시글 작성자 아이디를 클릭하여 해당 회원이 작성한 게시글들을 조회할 수 있다.
    -게시글 목록은 한 페이지에 최대 10개 게시글이 보여진다.
    -페이지는 최대 10개의 페이지가 보여진다.
    -게시글은 작성순으로 조회가 된다.
    -게시글 목록은 번호, 제목, 작성자, 작성일, 조회수, 추천/비추천 순으로 조회가 된다.
-게시글 상세 조회
	-사용자는 게시글 목록에서 게시글 제목을 선택하여 게시글 상세 내용을 조회할 수 있다.
    -게시글 상세 조회시 조회수가 1 증가한다.
    -게시글 상세에는 제목, 내용, 작성자, 조회수, 작성일, 첨부파일, 추천/비추천, 댓글을 조회한다.
    -게시글 상세에서 첨부파일을 클릭하면 다운로드가 진행된다.
    -추천/비추천 버튼을 클릭하면 회원인 경우 게시글을 추천/비추천하고, 아니면 알림 메시지로 회원만 가능한 기능이라고 안내한다.
    -댓글은 최대 5개까지 조회가 가능하며, 댓글 페이지는 최대 5개 까지 보여진다. 
    -댓글 입력창을 클릭하면 회원인 경우 댓글을 입력할 수 있고, 비회원인 경우 알림 메시지로 회원만 가능한 기능이라고 안내한다. 
회원
-게시글 관리 
	-게시글 등록
		-회원은 제목, 내용을 입력하고, 첨부파일을 선택하여 게시글을 등록할 수 있다.
        -첨부파일은 최대 3개까지 선택이 가능하다.
	-게시글 수정
		-회원은 본인이 등록한 게시글의 내용을 수정할 수 있다.
        -제목, 내용을 수정할 수 있고, 선택한 첨부파일을 변경할 수 있다.
			-첨부파일을 변경하면 기존에 올렸던 첨부파일은 삭제된다.
	-게시글 삭제
		-회원은 본인이 등록한 게시글을 삭제할 수 있다.
        -게시글을 삭제하면 등록된 댓글과 첨부파일, 추천들을 함께 삭제한다.
-댓글 관리
	-댓글 등록
		-회원은 게시글 상세에서 댓글을 등록할 수 있다.
        -댓글은 200자 제한이 있다.
	-댓글 수정
		-회원은 등록한 댓글을 수정할 수 있다.
	-댓글 삭제
		-회원은 등록한 댓글을 삭제할 수 있다.
        -댓글을 삭제하면 댓글 목록에서 제거 된다.
-신고 관리
	-게시글 신고
		-회원은 게시글 상세에서 게시글에 이상이 있는 경우 해당 게시글을 신고할 수 있다.
        -신고 사유는 욕설, 허위사실유포, 광고, 음란, 커뮤니티에 맞지 않음, 기타로 구분된다.
	-댓글 신고
		-회원은 댓글에서 이상이 있는 경우 해당 댓글을 신고할 수 있다.
        -신고 사유는 욕설, 허위사실유포, 광고, 음란, 커뮤니티에 맞지 않음, 기타로 구분된다.
-추천/비추천 
	-회원은 게시글 상세에서 게시글에 추천/비추천을 할 수 있다.
	-게시글은 추천/비추천 중 하나만 최대 하나만 가능하다.
    -추천/비추천을 하면 해당 게시글을 상세로 조회할 때 추천/비추천 버튼이 활성화 된다.
    
관리자
-커뮤니티 관리
	-커뮤니티 등록 
		-관리자는 커뮤니티 명을 입력하여커뮤니티를 등록할 수 있다.
        -커뮤니티 명은 중복되면 안된다. 
	-커뮤니티 수정 
		-관리자는 커뮤니티명을 수정할 수 있다.
        -커뮤니티명을 수정하면, 기존에 등록된 게시글들도 수정된 커뮤니티 명으로 변경된다.
        -커뮤니티 수정 시 , 기존 커뮤니티명으로 수정하지 못한다. 
	-커뮤니티 삭제a
		-관리자는 커뮤니티를 삭제할 수 있다.
        -커뮤니티가 삭제되면, 커뮤니티에 등록된 모든 게시글들과 첨부파일들도 함께 삭제가 된다.
        -남은 커뮤니티가 1개인 경우 삭제할 수 없다.
-게시글 관리
	-게시글 등록
		-관리자는 공지 커뮤니티에 게시글을 등록할 수 있다.
        
    -게시글 삭제
		-관리자는 게시글을 삭제할 수 있다.
        -관리자가 작성한 공지 게시글이나 신고가 3회 누적된 게시글에 대해 게시글을 삭제할 수 있다.
        -삭제시 게시글 내용을 확인하고, 확인된 내용을 토대로 관리자가 판단해서 삭제할 수 있다.
-댓글 관리 
	-댓글 삭제
		-관리자는 신고가 3회 누적된 댓글을 삭제할 수 있다.
        -삭제시 댓글 내용을 확인하고, 확인된 내용을 토대로 관리자가 판단해서 삭제할 수 있다.
-회원 관리
	-회원 정지
		-신고된 게시글이 관리자에 의해 5회 이상 삭제된 경우 1달간 이용이 정지할 수 있다.
			-신고 누적은 초기화가 된다.
		관리자는 신고된 게시글이 관리자에 의해 100회 이상 누적 삭제된 경우 해당 회원의 이용을 영구 정지할 수 있다.

        -
*/