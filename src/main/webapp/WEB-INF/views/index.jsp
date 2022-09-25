
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h2>ĐƠN XIN VIỆC</h2>
        ${message}
<form action="apply" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <div>Họ và tên ứng viên</div>
        <input type="text" name="fullname">
    </div>
    <div class="form-group">
        <div>Hình ảnh</div>
        <input type="file" name="photo">
    </div>
    <div class="form-group">
        <div>Hồ sơ xin việc</div>
        <input type="file" name="cv">
    </div>
    <div class="form-group">
        <button>Nộp</button>
    </div>
</form>

</body>
</html>
