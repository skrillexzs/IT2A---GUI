-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 03, 2025 at 02:28 PM
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
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_id` int(50) NOT NULL,
  `u_firstname` text NOT NULL,
  `u_lastname` text NOT NULL,
  `u_email` varchar(100) NOT NULL,
  `u_cnumber` varchar(20) NOT NULL,
  `u_password` varchar(100) NOT NULL,
  `u_type` varchar(100) NOT NULL,
  `u_status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_cnumber`, `u_password`, `u_type`, `u_status`) VALUES
(1, 'Mark Joseph', 'Canedo', 'mark@sample.com', '09933981679', '12345', 'Admin', 'Active'),
(2, 'arkeen', 'larisma', 'ken@test.com', '12345678901', '12345678', 'Librarian', 'Active'),
(3, 'joseph', 'canedo', 'joseph@test.com', '12345678901', '00000000', 'Borrower', 'Pending'),
(4, 'nina', 'canada', 'nleigh@gmail.com', '09999999123', 'nnnnnnnn', 'Borrower', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
