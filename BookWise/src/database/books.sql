-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2025 at 10:52 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `joseph`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `b_id` int(50) NOT NULL,
  `b_title` varchar(255) NOT NULL,
  `b_genre` varchar(255) NOT NULL,
  `b_author` varchar(255) NOT NULL,
  `date_published` varchar(255) NOT NULL,
  `b_condition` varchar(255) NOT NULL,
  `b_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`b_id`, `b_title`, `b_genre`, `b_author`, `date_published`, `b_condition`, `b_status`) VALUES
(1, 'Goat The Wanderpol', 'Horror', 'Mark Jay Sardido', '05-17-2025', 'New', 'Loaned'),
(2, 'Red Mars', 'Science Fiction', 'Kim Stanley Robinson', '1992', 'Replacement Required', 'Available'),
(3, 'Starter Villain', 'Science Fiction', 'John Scalzi', '2023', 'New', 'Available'),
(4, 'Happy Place', 'Romance', 'Emily Henry', '2023', 'New', 'Loaned'),
(5, 'The Fault in Our Stars', 'Romance', 'John Green', '2012', 'Old', 'Available'),
(6, 'Documentary Film in India', 'Documentary', 'Giulia Battaglia', '2017', 'Old', 'Available'),
(7, 'Dracula', 'Horror', 'Bram Stoker', '1897', 'Replacement Required', 'Available'),
(8, 'The Buffalo Hunter', 'Documentary', 'Stephen Graham Jones', '2025', 'New', 'Loaned');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`b_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `b_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
