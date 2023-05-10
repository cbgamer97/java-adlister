<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
    <h1>Order Your Pizza</h1>
    <form method="post" action="pizza-order">
        <label for="crust">Choose Your Crust:</label>
        <select name="crust" id="crust">
            <option value="thin-crust">Thin Crust</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="pan">Pan</option>
        </select>

        <label for="sauce">Choose Your Sauce:</label>
        <select name="sauce" id="sauce">
            <option value="red-sauce">Red Sauce</option>
            <option value="buffalo">Buffalo</option>
            <option value="cream">Cream Sauce</option>
        </select>

        <label for="size">Choose Your Pizza Size:</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>

        <fieldset>
            <legend>Toppings:</legend>
            <label for="pepperoni">Pepperoni</label>
            <input type="checkbox" name="topping" id="pepperoni" value="pepperoni">
            <label for="bacon">Bacon</label>
            <input type="checkbox" name="topping" id="bacon" value="bacon">
            <label for="sausage">Sausage</label>
            <input type="checkbox" name="topping" id="sausage" value="sausage">
            <label for="peppers">Peppers</label>
            <input type="checkbox" name="topping" id="peppers" value="peppers">
            <label for="onion">Onion</label>
            <input type="checkbox" name="topping" id="onion" value="onion">
            <label for="hamburger">Hamburger</label>
            <input type="checkbox" name="topping" id="hamburger" value="hamburger">
        </fieldset>

        <label for="address">Deliver to:</label>
        <input type="text" id="address" name="address">

        <input type="submit" value="submit">
    </form>
</body>
</html>
