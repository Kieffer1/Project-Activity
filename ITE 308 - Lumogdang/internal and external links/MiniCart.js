<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://unpkg.com/react@18/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.com/react-dom@18/umd/react-dom.development.js" crossorigin></script>
    <script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>
    <title>Mini Cart Shop</title>
</head>

<body>
    <div id="root"></div>

    <script type="text/babel">
        const users = ["Moe", "Kol", "Tay", "Pu"];
        const password = ["uglyducks", "chicken", "fiesta", "scissors"];
        const items = [
            { name: "SHORTS", price: 50},
            { name: "T SHIRT", price: 150 },
            { name: "SHOES", price: 200 },
            {name: "BAG", price: 250}
        ]

        function MiniCartShop() {
            const [username, setUsername] = React.useState("");
            const [passwords, setPassword] = React.useState("");
            const [loggedIn, setLoggedIn] = React.useState(true);
            const [totalPrice, setTotalPrice] = React.useState(0)
            const [cartItems, setCartItems] = React.useState([])

            function handleLogin(e) {
                e.preventDefault();

                if (user.includes(username) && passwords.includes(password)) {
                    console.log(Login in with username ${username} and password ${password});
                    setLoggedIn(true);
                } else {
                    alert("OOPS YOU ARE NOT A MEMBER OF THIS CARTSHOP!");
                }
            }

            function handleAddToCart(item) {
                const newItem = {
                    name: item.name,
                    price: item.price
                }

                setCartItems([...cartItems, newItem]);
                setTotalPrice(totalPrice + item.price);

            }

            return (
                <div>
                    {!loggedIn ? (
                        <form onSubmit={handleLogin}>
                            <label>Username:
                                <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
                            </label>
                            <br />
                            <label>
                                Password:
                                <input type="password" value={password[1]} onChange={(e) => setPassword(e.target.value)} />
                            </label>
                            <br />
                            <button type="submit">Log In</button>
                        </form>
                    ) : (
                        <div>
                            <h2>Available Items</h2>
                            <ul>
                                {items.map((item, index) => (
                                    <li key={index}>
                                        {item.name} = php{item.price}{""}
                                        <button onClick={() => handleAddToCart(item)}>Add To Cart</button>
                                    </li>
                                ))}
                            </ul>
                            <h2>Cart</h2>
                            <ul>
                                {cartItems.map((item, index) => (
                                    <li key={index}>
                                        {item.name} - Php{item.price}
                                    </li>
                                ))}
                            </ul>
                            <p>Total Price: Php{totalPrice}</p>
                        </div>
                    )}
                </div>
            );
        }

        ReactDOM.render(<MiniCartShop />, document.getElementById("root"));
    </script>
</body>

</html>