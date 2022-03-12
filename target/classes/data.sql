DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;

CREATE TABLE `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `device_id` varchar(100) NOT NULL,
  `model_name` varchar(100) NOT NULL,
  `model_number` varchar(20) NOT NULL,
  `serial_number` varchar(30) NOT NULL,
  `IMEI` varchar(25) NOT NULL,
  `mobile_number` varchar(15) NOT NULL,
  `os_name` varchar(10) NOT NULL,
  `os_type` varchar(20) NOT NULL,
  `os_version` varchar(5) NOT NULL,
  `status` varchar(10) NOT NULL,
  `ip` varchar(10) NOT NULL,
  `lan` varchar(25) NOT NULL,
  `lat` varchar(25) NOT NULL,
  `create_dt` date DEFAULT NULL
);

CREATE TABLE `accounts` (
  `customer_id` int NOT NULL,
   `account_number` int AUTO_INCREMENT  PRIMARY KEY,
  `account_type` varchar(100) NOT NULL,
  `branch_address` varchar(200) NOT NULL,
  `create_dt` date DEFAULT NULL
);

INSERT INTO `customer` (`device_id`,`model_name`,`model_number`,`serial_number`, `IMEI`, `mobile_number`, `os_name`, `os_type`, `os_version`, `status`, `ip`, `lan`, `lat` ,`create_dt`)
 VALUES ('A12345','LG','A89841','123456789', '5676347234', '9677130910', 'Android 10', 'Android Pie', '10.00', 'CREATED', '192.0.0.1', '89.938945' , '89.02933', CURDATE());

INSERT INTO `accounts` (`customer_id`, `account_number`, `account_type`, `branch_address`, `create_dt`)
 VALUES (1, 186576453, 'Savings', '123 Main Street, New York', CURDATE());