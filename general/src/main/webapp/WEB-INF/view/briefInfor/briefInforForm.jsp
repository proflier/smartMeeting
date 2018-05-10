<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<form id="mainForm" class="form-horizontal" role="form">
	<input type="hidden" name="id" value="${briefInfor.id }">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">
					<c:choose>
						<c:when test="${action eq 'create' }">
							新增
						</c:when>
						<c:when test="${action eq 'update' }">
							修改
						</c:when>
						<c:when test="${action eq 'detail' }">
							查看
						</c:when>
					</c:choose>
				</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="type" class="col-sm-2 control-label">类型</label>
					<div class="col-sm-10">
						<select class="form-control" name="type">
                            <option value='0' <c:if test="${briefInfor.type eq 0 }">selected="selected"</c:if>>公司</option>
                            <option value='1' <c:if test="${briefInfor.type eq 1 }">selected="selected"</c:if>>项目</option>
                            <option value='2' <c:if test="${briefInfor.type eq 2 }">selected="selected"</c:if>>会议</option>
                        </select>
					</div>
				</div>
				<div class="form-group">
					<label for="title" class="col-sm-2 control-label">标题</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="title" placeholder="标题" name="title" value="${briefInfor.title }">
					</div>
				</div>
				<div class="form-group">
					<label for="articleContent" class="col-sm-2 control-label">文章内容</label>
					<div class="col-sm-10">
						<textarea style="width: 100%;height: 90px;" name="articleContent" maxlength="500">${briefInfor.articleContent }</textarea>
					</div>
				</div>
				<c:if test="${action eq 'detail' }">
					<div class="form-group">
						<label for="createDate" class="col-sm-2 control-label">录入时间</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" value="<fmt:formatDate value='${briefInfor.createDate }' pattern='yyyy-MM-dd HH:mm:ss'/>">
						</div>
					</div>
					<div class="form-group">
						<label for="updateDate" class="col-sm-2 control-label">修改时间</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" value="<fmt:formatDate value='${briefInfor.updateDate }' pattern='yyyy-MM-dd HH:mm:ss'/>">
						</div>
					</div>
				</c:if>
			</div>
			<div class="modal-footer">
				<c:if test="${action ne 'detail' }">
					<button type="button" class="btn btn-primary" id="submitButton"
						data-loading-text="Loading..."
						data-container="body" data-toggle="popover" data-placement="right"
						data-content="保存成功">提交保存</button>
				</c:if>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
	</form>
<script type="text/javascript">
$(function(){
	$('#mainForm').bootstrapValidator({
		message: '这个值无效',
		feedbackIcons: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		fields: {
			title: {
                validators: {
                	notEmpty: {
						message: '标题不能为空'
					}
                }
            },
            articleContent: {
                validators: {
                    notEmpty: {
                        message: '文章内容不能为空'
                    }
                }
            }
		}
	});
	
	$("#submitButton").click(function() {
		/*手动验证表单，当是普通按钮时。*/
		var bootstrapValidator = $("#mainForm").data('bootstrapValidator');
		bootstrapValidator.validate();
		if (!bootstrapValidator.isValid()) {
			return false;
		}
		$(this).button('loading');
		$.post("${ctx }/briefInfor/save/${action}", $("#mainForm").serialize(), function(data) {
			if (data == "success") {
				cx();
				$("#submitButton").popover('show');
				setTimeout(function(){
					$("#submitButton").popover('hide');
// 					if ('${action}' == 'create') {
						$('#myModal').modal('hide');
// 					}
					$("#submitButton").button('reset');
				}, 1000);
			}
		});
	});
});
</script>