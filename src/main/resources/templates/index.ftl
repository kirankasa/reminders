<!DOCTYPE HTML>
<html>
<head>
    <title>Reminders Application</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <#--<link rel="stylesheet" href="/css/bootstrap.min.css" />-->
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <div class="control-group">
        <h2 class="muted">Reminder</h2>
        <form name="reminder" action="" method="post">
            <div class="control-group">
                <label class="control-label" for="title">Title</label>
            </div>
            <div class="controls">
                <input type="text" name="title">
            </div>
            <div class="control-group">
                <label class="control-label" for="note">Additional Notes</label>
            </div>
            <div class="controls">
                <input type="text" name="note">
            </div>

            <div class="controls">
                <input type="submit" class="btn btn-primary">
            </div>
        </form>
    </div>
    <div>
    <#if reminders?size != 0 >
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Reminder Id</th>
                <th>Reminder Title</th>
                <th>Reminder Note</th>

            </tr>
            </thead>
            <tbody>
                <#list reminders as reminder>
                <tr>
                    <td>${reminder.id}</td>
                    <td>${reminder.title}</td>
                    <td>${reminder.note}</td>
                </tr>
                </#list>
            </tbody>
        </table>
    </#if>
    </div>
</div>
</body>
</html>