<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List cars</title>
</head>
<body>
    <h2>List cars</h2>
    <table>
        <thead>
        <th>Date Of Manufacture</th>
        <th>Car Make</th>
        <th>Licence</th>
        <th>Cruise Control</th>

        </thead>
        <tbody>
        <#list cars as car>
        <tr>
            <td>${car.dateOfManufacture}</td>
            <td>${car.carMake}</td>
            <td>${car.licence}</td>
            <td>${car.cruiseControl?string('yes','no')}</td>
        </tr>
        </#list>
        </tbody>
    </table>
<
</body>
</html>