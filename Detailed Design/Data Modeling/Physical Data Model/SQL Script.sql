-- create tables and primary keys
CREATE TABLE Media (
    id INT NOT NULL,
    title VARCHAR(45),
    categoryType VARCHAR(50),
    value INT,
    price INT,
    quantity INT,
    imageURL VARCHAR(100)
);
ALTER TABLE Media
ADD CONSTRAINT PK_Media PRIMARY KEY (id);

CREATE TABLE ShippingMethod (
    id INT NOT NULL,
    name VARCHAR(50),
    description VARCHAR(100)
);
ALTER TABLE ShippingMethod
ADD CONSTRAINT PK_ShippingMethod PRIMARY KEY (id);

CREATE TABLE MediaShippingMethod (
    id INT NOT NULL,
    media_id INT NOT NULL,
    shippingMethod_id INT NOT NULL
);
ALTER TABLE MediaShippingMethod
ADD CONSTRAINT PK_MediaShippingMethod PRIMARY KEY (id);

CREATE TABLE DeliveryAddress (
    id INT NOT NULL,
    name VARCHAR(100),
    phone INT,
    province VARCHAR(20),
    address VARCHAR(100),
    instruction VARCHAR(200)
);
ALTER TABLE DeliveryAddress
ADD CONSTRAINT PK_DeliveryAddress PRIMARY KEY (id);

CREATE TABLE Order (
    id INT NOT NULL,
    shippingFees INT,
    deliveryAddress_id INT NOT NULL
);
ALTER TABLE Order
ADD CONSTRAINT PK_Order PRIMARY KEY (id);

CREATE TABLE OrderMedia (
    id INT NOT NULL,
    media_id INT NOT NULL,
    price INT,
    quantity INT,
    order_id INT NOT NULL
);
ALTER TABLE OrderMedia
ADD CONSTRAINT PK_OrderMedia PRIMARY KEY (id);

CREATE TABLE ShippingInfo (
    id INT NOT NULL,
    orderMedia_id INT NOT NULL,
    shippingMethod_id INT NOT NULL,
    shippingFee INT
);
ALTER TABLE shippingInfo
ADD CONSTRAINT PK_shippingInfo PRIMARY KEY (id);

CREATE TABLE RushOrder (
    id INT NOT NULL,
    shippingInfo_id INT NOT NULL,
    shippingMethod_id INT NOT NULL,
    instruction VARCHAR(200),
    deliveryTime DATETIME
)
ALTER TABLE RushOrder
ADD CONSTRAINT PK_RushOrder PRIMARY KEY (id);

CREATE TABLE PaymentTransaction (
    id INT NOT NULL,
    method VARCHAR(20),
    bankName VARCHAR(45),
    content VARCHAR(100),
    time DATETIME,
    status VARCHAR(50)
);
ALTER TABLE PaymentTransaction
ADD CONSTRAINT PK_PaymentTransaction PRIMARY KEY (id);

CREATE TABLE Invoice (
    id INT NOT NULL,
    totalAmount INT,
    order_id INT NOT NULL,
    vat INT,
    paymentTransaction_id INT
);
ALTER TABLE Invoice
ADD CONSTRAINT PK_Invoice PRIMARY KEY (id);

-- create foregin keys
ALTER TABLE MediaShippingMethod
ADD CONSTRAINT FK_MediaShippingMethod_0 FOREIGN KEY (media_id) REFERENCES Media (id);

ALTER TABLE MediaShippingMethod
ADD CONSTRAINT FK_MediaShippingMethod_1 FOREIGN KEY (shippingMethod_id) REFERENCES ShippingMethod (id);

ALTER TABLE Order
ADD CONSTRAINT FK_Order_0 FOREIGN KEY (deliveryAddress_id) REFERENCES DeliveryAddress (id);

ALTER TABLE OrderMedia
ADD CONSTRAINT FK_OrderMedia_0 FOREIGN KEY (media_id) REFERENCES Media (id);

ALTER TABLE OrderMedia
ADD CONSTRAINT FK_OrderMedia_1 FOREIGN KEY (order_id) REFERENCES Order (id);

ALTER TABLE ShippingInfo
ADD CONSTRAINT FK_ShippingInfo_0 FOREIGN KEY (orderMedia_id) REFERENCES OrderMedia (id);

ALTER TABLE ShippingInfo
ADD CONSTRAINT FK_ShippingInfo_1 FOREIGN KEY (shippingMethod_id) REFERENCES ShippingMethod (id);

ALTER TABLE RushOrder
ADD CONSTRAINT FK_RushOrder_0 FOREIGN KEY (shippingInfo_id) REFERENCES ShippingInfo (id);

ALTER TABLE RushOrder

ADD CONSTRAINT FK_RushOrder_1 FOREIGN KEY (shippingMethod_id) REFERENCES ShippingMethod (id);
ALTER TABLE Invoice
ADD CONSTRAINT FK_Invoice_0 FOREIGN KEY (order_id) REFERENCES Order (id);

ALTER TABLE Invoice
ADD CONSTRAINT FK_Invoice_1 FOREIGN KEY (paymentTransaction_id) REFERENCES PaymentTransaction (id);
