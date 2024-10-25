<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .earned {
            color: green;
        }
        .lost {
            color: red;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container text-center">
        </br>
        <h2>Your Gold: ${gold}</h2>

        <div class="row mt-4 justify-content-center">
            <div class="col-md-3">
                <div class="card mb-4">
                    <div class="card-body">
                        <h3 class="card-title">Farm</h3>
                        <p class="card-text">(earns 10 - 20 gold)</p>
                        <form action="/processGold" method="post">
                            <input type="hidden" name="activity" value="farm">
                            <button type="submit" class="btn btn-success">Find Gold</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card mb-4">
                    <div class="card-body">
                        <h3 class="card-title">Cave</h3>
                        <p class="card-text">(earns 5 - 10 gold)</p>
                        <form action="/processGold" method="post">
                            <input type="hidden" name="activity" value="cave">
                            <button type="submit" class="btn btn-success">Find Gold</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card mb-4">
                    <div class="card-body">
                        <h3 class="card-title">House</h3>
                        <p class="card-text">(earns 2 - 5 gold)</p>
                        <form action="/processGold" method="post">
                            <input type="hidden" name="activity" value="house">
                            <button type="submit" class="btn btn-success">Find Gold</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card mb-4">
                    <div class="card-body">
                        <h3 class="card-title">Quest</h3>
                        <p class="card-text">(earns/takes 0 - 50 gold)</p>
                        <form action="/processGold" method="post">
                            <input type="hidden" name="activity" value="quest">
                            <button type="submit" class="btn btn-success">Find Gold</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <h3>Activities:</h3>
        <ul class="list-group">
            <c:forEach var="activity" items="${activityLog}">
                <li class="list-group-item 
                    ${activity.contains('lost') ? 'lost' : activity.contains('earned') ? 'earned' : ''}">
                    ${activity}
                </li>
            </c:forEach>
        </ul>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

    