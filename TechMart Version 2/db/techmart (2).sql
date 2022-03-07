-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 07, 2022 at 04:53 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `techmart`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `userID` varchar(40) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`userID`, `password`) VALUES
('admin1@gmail.com', 'admin1'),
('admin2@gmail.com', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `userID` varchar(40) NOT NULL,
  `itemID` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`userID`, `itemID`, `quantity`, `date`) VALUES
('mekhala@gmail.com', 'fsdfdsf', 13, '2022-03-16 00:00:00'),
('mekhala@gmail.com', 'rreewrew', 12, '2022-03-22 00:00:00'),
('mekhala@gmail.com', 'phoflaapppin', 4, '2022-03-09 00:00:00'),
('skasunmk98@gmail.com', 'chachasamsungwhi', 5, '2022-03-07 10:10:14'),
('skasunmk982@gmail.com', 'chachasamsungwhi', 1, '2022-03-07 10:21:11'),
('skasunmk982@gmail.com', 'heawirredmibla', 1, '2022-03-07 08:39:18'),
('skasunmk98@gmail.com', 'heawirsonysil', 5, '2022-03-07 09:59:22'),
('skasunmk982@gmail.com', 'heachahuaweiwhi', 1, '2022-03-07 10:02:43');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items` (
  `itemID` varchar(20) NOT NULL,
  `itemName` varchar(40) DEFAULT NULL,
  `mainCategory` varchar(40) DEFAULT NULL,
  `subCategory` varchar(40) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `color` varchar(10) NOT NULL,
  `inStockItem` int(11) DEFAULT NULL,
  `warrantyTime` varchar(60) DEFAULT NULL,
  `shortDescription` varchar(100) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `brand` varchar(40) DEFAULT NULL,
  `imagePath` varchar(100) NOT NULL,
  PRIMARY KEY (`itemID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`itemID`, `itemName`, `mainCategory`, `subCategory`, `price`, `color`, `inStockItem`, `warrantyTime`, `shortDescription`, `rating`, `brand`, `imagePath`) VALUES
('phoflaapppin', 'apple flagships smart phone ', 'phone', 'flagships smart phone', 256000, 'pink', 4, '1 year warranty', 'brand new apple iphone 13 (6gb ram, 512gb rom)', 5, 'apple', 'resources/img/items/phoflaapppin.jpg'),
('phobudhuablu', 'huawei budget smart phone ', 'phone', 'budget smart phone', 38000, 'blue', 12, '2 year warranty', 'brand new huawei phone  (6gb ram, 128gb rom,48 Mpx)', 4, 'huawei', 'resources/img/items/phobudhuablu.jpg'),
('phomidredblu', 'redmi note 9 mid range smart phone ', 'phone', 'mid range smart phone', 67000, 'blue', 5, '2 years warranty', 'brand new redmi note 9 phone(6gb ram, 64 gb rom, 64Mpx)', 6, 'redmi note 9', 'resources/img/items/phomidredblu.jpg'),
('phobudredblu', 'redmi 10s pro budget smart phone ', 'phone', 'budget smart phone', 37000, 'blue', 4, '2 years warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 3, 'redmi 10s pro', 'resources/img/items/phobudredblu.jpg'),
('phoflaXiasil', 'Xiaomi 11T flagships smart phone ', 'phone', 'flagships smart phone', 75000, 'silver', 7, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 8, 'Xiaomi 11T', 'resources/img/items/phoflaXiasil.jpg'),
('phoflaXiagre', 'Xiaomi 11T flagships smart phone ', 'phone', 'flagships smart phone', 84000, 'green', 7, '2 years warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 5, 'Xiaomi 11T', 'resources/img/items/phoflaXiagre.jpg'),
('phobudAppwhi', 'Apple iPhone 11 budget smart phone ', 'phone', 'budget smart phone', 125000, 'white', 7, '2 years warranty', 'brand new apple iphone 11 (6gb ram, 512gb rom)', 5, 'Apple iPhone 11', 'resources/img/items/phobudAppwhi.jpg'),
('phobudoppblu', 'oppo budget smart phone ', 'phone', 'budget smart phone', 34000, 'blue', 2, '2 years warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 6, 'oppo', 'resources/img/items/phobudoppblu.jpg'),
('phobudsamgol', 'samsung budget smart phone ', 'phone', 'budget smart phone', 23000, 'gold', 3, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 6, 'samsung', 'resources/img/items/phobudsamgol.png'),
('phobudHUAbla', 'HUAWEI Y5p budget smart phone ', 'phone', 'budget smart phone', 34000, 'black', 4, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 7, 'HUAWEI Y5p', 'resources/img/items/phobudHUAbla.png'),
('phoflahuablu', 'huawei flagships smart phone ', 'phone', 'flagships smart phone', 98000, 'blue', 4, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 4, 'huawei', 'resources/img/items/phoflahuablu.jpg'),
('phobudsonsil', 'sony budget smart phone ', 'phone', 'budget smart phone', 34000, 'silver', 5, '2 years warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 3, 'sony', 'resources/img/items/phobudsonsil.png'),
('phobudApple blu', 'Apple iPhone 12 Mini budget smart phone ', 'phone', 'budget smart phone', 130000, 'blue', 6, '1 year warranty', 'brand new huawei phone  (6gb ram, 128gb rom,48 Mpx)', 4, 'Apple iPhone 12 Mini', 'resources/img/items/phobudApple blu.png'),
('phoflasonybla', 'sony flagships smart phone ', 'phone', 'flagships smart phone', 56000, 'black', 2, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 3, 'sony', 'resources/img/items/phoflasonybla.png'),
('heablusamsunggre', 'samsung bluetooth Headset ', 'headset', 'bluetooth Headset', 34000, 'green', 8, '1 year warranty', 'bluetooth headset with quality sounds', 4, 'samsung', 'resources/img/items/heablusamsunggre.jpg'),
('heawirhuaweibla', 'huawei wired Headset ', 'headset', 'wired Headset', 890, 'black', 6, '1 year warranty', 'best headset with quality sounds', 6, 'huawei', 'resources/img/items/heawirhuaweibla.png'),
('heawiroppobla', 'oppo wired Headset ', 'headset', 'wired Headset', 1200, 'black', 7, '1 year warranty', 'oppo headset with quality sounds', 9, 'oppo', 'resources/img/items/heawiroppobla.png'),
('heawirsonysil', 'sony wired Headset ', 'headset', 'wired Headset', 4200, 'silver', 4, '2 years warranty', 'best quality sounds with sony headset', 8, 'sony', 'resources/img/items/heawirsonysil.jpg'),
('heawirredmibla', 'redmi wired Headset ', 'headset', 'wired Headset', 890, 'black', 4, '2 year warranty', 'best headset with quality sounds', 8, 'redmi', 'resources/img/items/heawirredmibla.png'),
('chawirhuaweisil', 'huawei wireless Charger ', 'charger', 'wireless Charger', 4500, 'silver', 3, '1 year warranty', 'best charging experience with wireless charger', 6, 'huawei', 'resources/img/items/chawirhuaweisil.png'),
('chacaboppobla', 'oppo cable Charger ', 'charger', 'cable Charger', 890, 'black', 4, '1 year warranty', 'oppo mobile charger', 8, 'oppo', 'resources/img/items/chacaboppobla.jpg'),
('chacabsonybla', 'sony cable Charger ', 'charger', 'cable Charger', 780, 'black', 5, '1 year warranty', 'best charging experience with sony charger', 5, 'sony', 'resources/img/items/chacabsonybla.png'),
('chachasamsungwhi', 'samsung charger Adapter ', 'charger', 'charger Adapter', 1200, 'white', 8, '1 year warranty', 'samsung charging adapter and usb cable', 9, 'samsung', 'resources/img/items/chachasamsungwhi.png'),
('heachahuaweiwhi', 'huawei charger Adapter ', 'headset', 'charger Adapter', 1300, 'white', 9, '1 year warranty', 'huawei charging adapter with usb cabel', 8, 'huawei', 'resources/img/items/heachahuaweiwhi.png'),
('heabluapplered', 'apple bluetooth Headset ', 'headset', 'bluetooth Headset', 18000, 'red', 6, '1 year warranty', 'best quality sounds with apple bluetooth headset', 12, 'apple', 'resources/img/items/heabluapplered.jpg'),
('phobacAnkerpin', 'Anker back cover ', 'phone Cover', 'back cover', 900, 'pink', 4, '1 year warranty', 'pink color smart phone back cover ', 5, 'Anker', 'resources/img/items/phobacAnkerpin.jpg'),
('phofulAukeybro', 'Aukey full cover ', 'phone Cover', 'full cover', 2300, 'brown', 4, '1 year warranty', 'best smart phone back cover(brown color)', 5, 'Aukey', 'resources/img/items/phofulAukeybro.png'),
('phobacredmigra', 'redmi back cover ', 'phone Cover', 'back cover', 670, 'gray', 4, '1 year warranty', 'smart phone back cover made by redmi company', 6, 'redmi', 'resources/img/items/phobacredmigra.jpg'),
('pow560samsungbla', 'samsung 5600w ', 'power Bank', '5600w', 7800, 'black', 4, '1 year warranty', '5600w power bank (color balck, free data cable)', 7, 'samsung', 'resources/img/items/pow560samsungbla.png'),
('pow480applewhi', 'apple 4800w ', 'power Bank', '4800w', 23000, 'white', 5, '1 year warranty', 'white color power bank made by apple ', 4, 'apple', 'resources/img/items/pow480applewhi.jpg'),
('phobacsamsungpur', 'samsung back cover ', 'phone Cover', 'back cover', 900, 'purple', 5, '1 year warranty', 'best backcover made by samsung', 6, 'samsung', 'resources/img/items/phobacsamsungpur.png'),
('phoflahuaweigra', 'huawei flagships smart phone ', 'phone', 'flagships smart phone', 45000, 'gray', 4, '1 year warranty', 'brand new 4G smart phone (6gb ram, 512gb rom, 64Mpx, Android 11)', 4, 'huawei', 'resources/img/items/phoflahuaweigra.jpg'),
('phofulapplebla', 'apple full cover ', 'phone Cover', 'full cover', 4500, 'black', 4, '1 year warranty', 'best backcover made by apple', 9, 'apple', 'resources/img/items/phofulapplebla.jpg'),
('dishalapplebla', 'apple half tempered ', 'display Tempered', 'half tempered', 4500, 'black', 5, '1 year warranty', 'best backcover made by apple', 5, 'apple', 'resources/img/items/dishalapplebla.png'),
('batkeysamsungbla', 'samsung keypad Mobiles ', 'baterry', 'keypad Mobiles', 500, 'black', 9, '1 year warranty', 'best battery for keypad phones', 6, 'samsung', 'resources/img/items/batkeysamsungbla.jpg'),
('bat560huaweibla', 'huawei 5600w ', 'baterry', '5600w', 4900, 'black', 4, '1 year warranty', 'best battery for smart phones', 5, 'huawei', 'resources/img/items/bat560huaweibla.jpg'),
('bat780redmibla', 'redmi 7800w ', 'baterry', '7800w', 6000, 'black', 6, '1 year warranty', 'best battery for smart phones', 4, 'redmi', 'resources/img/items/bat780redmibla.jpg'),
('cabmichuaweibla', 'huawei micro port cables ', 'cables', 'micro port cables', 560, 'black', 5, '1 year warranty', 'best usb converter cabel', 4, 'huawei', 'resources/img/items/cabmichuaweibla.jpg'),
('cabC psamsungwhi', 'samsung C port cables ', 'cables', 'C port cables', 780, 'white', 5, '1 year warranty', 'best usb converter cabel', 3, 'samsung', 'resources/img/items/cabC psamsungwhi.jpg'),
('cabC poppowhi', 'oppo C port cables ', 'cables', 'C port cables', 890, 'white', 4, '1 year warranty', 'best usb converter cabel', 7, 'oppo', 'resources/img/items/cabC poppowhi.jpg'),
('memmemhuaweibla', 'huawei memory chip 32gb ', 'memory Device', 'memory chip 32gb', 2300, 'black', 7, '1 year warranty', 'best memory device for mobiles', 4, 'huawei', 'resources/img/items/memmemhuaweibla.jpg'),
('memmemredmibla', 'redmi memory chip 64gb ', 'memory Device', 'memory chip 64gb', 3400, 'black', 7, '1 year warranty', 'best memory device for mobiles', 5, 'redmi', 'resources/img/items/memmemredmibla.jpg'),
('mempensamsunggol', 'samsung pendrive 16bg ', 'memory Device', 'pendrive 16bg', 3400, 'gold', 4, '1 year warranty', 'best memory device for mobiles', 4, 'samsung', 'resources/img/items/mempensamsunggol.jpg'),
('smasmaapplegol', 'apple smart watch ', 'smart Watch', 'smart watch', 67000, 'gold', 6, '1 year warranty', 'best smart watches made by apple', 4, 'apple', 'resources/img/items/smasmaapplegol.png'),
('smasmahuaweibla', 'huawei smart watch ', 'smart Watch', 'smart watch', 45000, 'black', 4, '1 year warranty', 'best smart watches made by huawei', 6, 'huawei', 'resources/img/items/smasmahuaweibla.jpg'),
('selbudhuaweibla', 'huawei budget smart phone ', 'selfi sticks', 'budget smart phone', 2300, 'black', 9, '1 year warranty', 'best selfi stick for photography', 4, 'huawei', 'resources/img/items/selbudhuaweibla.png');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
CREATE TABLE IF NOT EXISTS `review` (
  `userID` varchar(40) NOT NULL,
  `itemID` varchar(20) NOT NULL,
  `discription` varchar(100) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`userID`, `itemID`, `discription`, `rating`) VALUES
('mekhala@gmail.com', 'phoflaapppin', '', 2),
('mekhala@gmail.com', 'phobudhuablu', '', 5),
('mekhala@gmail.com', 'phoflaapppin', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudhuablu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5),
('mekhala@gmail.com', 'phomidredblu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phoflaXiasil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'phoflaXiagre', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phobudAppwhi', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5),
('mekhala@gmail.com', 'phobudoppblu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phobudsamgol', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'phobudHUAbla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudHUAbla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phoflahuablu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudsonsil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phobudApple blu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phoflasonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phoflasonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heablusamsunggre', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirhuaweibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heawiroppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirsonysil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heawirredmibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'heawiroppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirsonysil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 6),
('mekhala@gmail.com', 'heawirredmibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'chacaboppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'chacabsonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5),
('mekhala@gmail.com', 'phoflaapppin', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudhuablu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5),
('mekhala@gmail.com', 'phomidredblu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phoflaXiasil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'phoflaXiagre', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phobudAppwhi', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5),
('mekhala@gmail.com', 'phobudoppblu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phobudsamgol', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'phobudHUAbla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudHUAbla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phoflahuablu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'phobudsonsil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phobudApple blu', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'phoflasonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'phoflasonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heablusamsunggre', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirhuaweibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heawiroppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirsonysil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 4),
('mekhala@gmail.com', 'heawirredmibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'heawiroppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 2),
('mekhala@gmail.com', 'heawirsonysil', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 6),
('mekhala@gmail.com', 'heawirredmibla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 1),
('mekhala@gmail.com', 'chacaboppobla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 3),
('mekhala@gmail.com', 'chacabsonybla', 'This product is excellent and I highly recommend that product to other customers 😍😍😍😍', 5);

-- --------------------------------------------------------

--
-- Table structure for table `salesagent`
--

DROP TABLE IF EXISTS `salesagent`;
CREATE TABLE IF NOT EXISTS `salesagent` (
  `userID` varchar(40) NOT NULL,
  `password` varchar(20) NOT NULL,
  `branch` varchar(20) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesagent`
--

INSERT INTO `salesagent` (`userID`, `password`, `branch`) VALUES
('agent1@gmail.com', 'agent1', 'galle'),
('agent2@gmail.com', 'agent2', 'kandy'),
('agent3@gmail.com', 'agent3', 'nugegoda'),
('agent4@gmail.com', 'agent4', 'gampaha'),
('agent5@gmail.com', 'agent5', 'kurunegala'),
('agent6@gmail.com', 'agent6', 'jaffna'),
('agent7@gmail.com', 'agent7', 'colombo');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE IF NOT EXISTS `suppliers` (
  `userID` varchar(40) NOT NULL,
  `password` varchar(20) NOT NULL,
  `branch` varchar(20) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`userID`, `password`, `branch`) VALUES
('supplier1@gmail.com', 'supplier1', 'galle'),
('supplier2@gmail.com', 'supplier2', 'kandy'),
('supplier3@gmail.com', 'supplier3', 'nugegoda'),
('supplier4@gmail.com', 'supplier4', 'gampaha'),
('supplier5@gmail.com', 'supplier5', 'kurunegala'),
('supplier6@gmail.com', 'supplier6', 'jaffna'),
('supplier7@gmail.com', 'supplier7', 'colombo');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `orderID` varchar(80) NOT NULL,
  `userID` varchar(40) NOT NULL,
  `itemsCount` int(11) NOT NULL,
  `amount` double NOT NULL,
  `date` timestamp NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `email` varchar(40) NOT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`email`, `firstName`, `lastName`, `password`) VALUES
('mekhala@gmail.com', 'mekala', 'withanage', '43i5h3454354534h53h45345344'),
('skasunmk982@gmail.com', 'kasun', 'madhumal', '81dc9bdb52d04dc20036dbd8313ed055'),
('dilshan@gmail.com', 'dishan', 'kalhhara', 'j34h434r32u4h24h23432u42343u443423'),
('malshani@gmail.com', 'malshani', 'dahanayaka', '4jh5h45h45i43hiu5345h43543iu5h435h'),
('pubudu@gmail.com', 'pubudu', 'chathuranga', '34k5h43j5h43j5j345hj34h5j345h34j5h3j3454'),
('dilka@gmail.com', 'dilka', 'malith', '43jh543j5345hj34h5j43h5jrh435j43h543h4j53'),
('skasunmk98@gmail.com', 'kasun', 'madhumal', '81dc9bdb52d04dc20036dbd8313ed055');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
