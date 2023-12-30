CREATE TABLE dishes (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    shop_id INT UNSIGNED,
    name VARCHAR(255) NOT NULL,
    price INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP DEFAULT NULL,
    FOREIGN KEY (shop_id) REFERENCES shops(id)
);

INSERT INTO dishes (`shop_id`, `name`, `price`) VALUES
    (1, '짜장', 7000),
    (1, '짬뽕', 8000),
    (1, '울면', 8000),
    (1, '만두', 6000),
    (1, '볶음밥', 8500),
    (1, '짬뽕밥', 8500),
    (1, '잡채밥', 9500),
    (2, '단팥빵', 2400),
    (2, '소보로', 2500),
    (2, '생크림빵', 2900),
    (2, '슈크림빵', 1900),
    (2, '우유샌드', 3700);