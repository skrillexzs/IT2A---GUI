-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2025 at 10:53 AM
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
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `l_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `act_performed` varchar(255) NOT NULL,
  `date_performed` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`l_id`, `u_id`, `act_performed`, `date_performed`) VALUES
(1, 2, 'New Book added! ID: 1', '2025-05-17 13:11:23'),
(2, 2, 'Updated Books Successfully! ID: 1', '2025-05-18 10:32:29'),
(3, 2, 'New Book added! ID: 2', '2025-05-18 11:16:03'),
(4, 2, 'New Book added! ID: 3', '2025-05-18 11:17:05'),
(5, 2, 'New Book added! ID: 4', '2025-05-18 11:17:55'),
(6, 2, 'New Book added! ID: 5', '2025-05-18 11:18:43'),
(7, 2, 'Updated Books Successfully! ID: 2', '2025-05-18 11:18:57'),
(8, 2, 'New Book added! ID: 6', '2025-05-18 11:20:54'),
(9, 2, 'New Book added! ID: 7', '2025-05-18 11:21:41'),
(10, 2, 'Updated Books Successfully! ID: 7', '2025-05-18 11:21:47'),
(11, 2, 'New Book added! ID: 8', '2025-05-18 11:22:52'),
(12, 7, 'Log in!', '2025-05-19 14:59:26'),
(13, 7, 'Log in!', '2025-05-19 16:19:47'),
(14, 7, 'Log in!', '2025-05-19 16:21:10'),
(15, 7, 'Log in!', '2025-05-19 16:21:58'),
(16, 7, 'Log in!', '2025-05-19 16:22:33'),
(17, 7, 'Log in!', '2025-05-19 16:23:49'),
(18, 7, 'Log in!', '2025-05-19 16:34:48'),
(19, 7, 'Log in!', '2025-05-19 16:43:29'),
(20, 7, 'Log in!', '2025-05-19 16:48:29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `u_id` (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `l_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `u_id` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
