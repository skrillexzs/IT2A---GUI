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
-- Table structure for table `loanedbooks_tbl`
--

CREATE TABLE `loanedbooks_tbl` (
  `lb_id` int(50) NOT NULL,
  `b_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `loaned_date` date NOT NULL,
  `due_date` date NOT NULL,
  `return_date` date DEFAULT NULL,
  `penalty` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loanedbooks_tbl`
--

INSERT INTO `loanedbooks_tbl` (`lb_id`, `b_id`, `u_id`, `loaned_date`, `due_date`, `return_date`, `penalty`, `status`) VALUES
(1, 7, 7, '2025-05-19', '2025-06-02', NULL, '0.0', 'On Loan'),
(2, 6, 7, '2025-05-19', '2025-06-02', NULL, '0.0', 'On Loan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  ADD PRIMARY KEY (`lb_id`),
  ADD KEY `id` (`u_id`),
  ADD KEY `b_id` (`b_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  MODIFY `lb_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  ADD CONSTRAINT `b_id` FOREIGN KEY (`b_id`) REFERENCES `books` (`b_id`),
  ADD CONSTRAINT `id` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
