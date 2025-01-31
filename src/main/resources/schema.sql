CREATE TABLE grocery_items (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               name VARCHAR(255) NOT NULL,
                               price DECIMAL(10,2) NOT NULL,
                               inventory_level INT NOT NULL DEFAULT 0
);
