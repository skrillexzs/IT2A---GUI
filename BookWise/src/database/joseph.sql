-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2025 at 03:46 PM
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
(7, 'Dracula', 'Horror', 'Bram Stoker', '1897', 'Replacement Required', 'Loaned'),
(8, 'The Buffalo Hunter', 'Documentary', 'Stephen Graham Jones', '2025', 'New', 'Loaned');

-- --------------------------------------------------------

--
-- Table structure for table `loanedbooks_tbl`
--

CREATE TABLE `loanedbooks_tbl` (
  `lb_id` int(50) NOT NULL,
  `b_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `loaned_date` date DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `loan_duration` varchar(225) DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `penalty` varchar(255) DEFAULT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loanedbooks_tbl`
--

INSERT INTO `loanedbooks_tbl` (`lb_id`, `b_id`, `u_id`, `loaned_date`, `due_date`, `loan_duration`, `return_date`, `penalty`, `status`) VALUES
(1, 7, 7, '2025-05-19', '2025-06-02', NULL, NULL, '0.0', 'On Loan'),
(2, 6, 7, '2025-05-19', '2025-06-02', '3 Days', NULL, 'None', 'Loaned'),
(3, 6, 9, '2025-05-20', '2025-06-03', NULL, NULL, '0.0', 'On Loan'),
(4, 5, 7, '2025-05-22', '2025-06-05', NULL, NULL, NULL, 'Pending'),
(5, 2, 7, '2025-05-22', '2025-05-29', '7 Days', NULL, 'None', 'Loaned'),
(6, 3, 9, '2025-05-22', NULL, NULL, NULL, NULL, 'Pending'),
(7, 6, 9, NULL, NULL, NULL, NULL, NULL, 'Pending');

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
(20, 7, 'Log in!', '2025-05-19 16:48:29'),
(21, 2, 'Log in!', '2025-05-20 18:30:17'),
(22, 1, 'Log in!', '2025-05-20 18:30:59'),
(23, 1, 'Log in!', '2025-05-20 18:58:15'),
(24, 9, 'Log in!', '2025-05-20 18:58:50'),
(25, 9, 'Log in!', '2025-05-20 19:36:18'),
(26, 7, 'Log in!', '2025-05-20 19:36:33'),
(27, 9, 'Log in!', '2025-05-20 20:01:58'),
(28, 2, 'Log in!', '2025-05-20 20:29:13'),
(29, 1, 'Log in!', '2025-05-20 20:29:46'),
(30, 7, 'Log in!', '2025-05-20 20:30:44'),
(31, 7, 'Log in!', '2025-05-20 20:39:34'),
(32, 7, 'Log in!', '2025-05-20 20:48:19'),
(33, 7, 'Log in!', '2025-05-20 20:53:05'),
(34, 7, 'Log in!', '2025-05-20 20:54:33'),
(35, 7, 'Log in!', '2025-05-20 20:58:41'),
(36, 9, 'Log in!', '2025-05-20 20:59:47'),
(37, 7, 'Log in!', '2025-05-20 21:01:39'),
(38, 2, 'Log in!', '2025-05-20 21:04:01'),
(39, 2, 'Updated Books Successfully! ID: 7', '2025-05-20 21:04:13'),
(40, 2, 'Log in!', '2025-05-20 21:15:30'),
(41, 2, 'Log in!', '2025-05-20 21:18:08'),
(42, 2, 'Log in!', '2025-05-22 09:10:12'),
(43, 7, 'Log in!', '2025-05-22 15:41:02'),
(44, 7, 'Log in!', '2025-05-22 15:41:54'),
(45, 7, 'Log in!', '2025-05-22 15:42:35'),
(46, 7, 'Log in!', '2025-05-22 15:44:29'),
(47, 7, 'Log in!', '2025-05-22 15:45:40'),
(48, 7, 'Log in!', '2025-05-22 16:02:36'),
(49, 2, 'Log in!', '2025-05-22 17:00:40'),
(50, 2, 'Log in!', '2025-05-22 17:02:08'),
(51, 2, 'Log in!', '2025-05-22 17:03:38'),
(52, 2, 'Log in!', '2025-05-22 17:05:54'),
(53, 2, 'Log in!', '2025-05-22 17:09:47'),
(54, 2, 'Log in!', '2025-05-22 17:15:28'),
(55, 2, 'Log in!', '2025-05-22 17:18:56'),
(56, 2, 'Log in!', '2025-05-22 17:20:24'),
(57, 2, 'Log in!', '2025-05-22 17:40:27'),
(58, 2, 'Updated Loaning Books Successfully! ID: 2', '2025-05-22 17:40:45'),
(59, 2, 'Log in!', '2025-05-22 17:42:13'),
(60, 2, 'Log in!', '2025-05-22 18:01:53'),
(61, 7, 'Log in!', '2025-05-22 18:02:14'),
(62, 2, 'Log in!', '2025-05-22 18:03:13'),
(63, 2, 'Updated Loans Successfully! ID: 5', '2025-05-22 18:03:36'),
(64, 9, 'Log in!', '2025-05-22 18:30:01'),
(65, 2, 'Log in!', '2025-05-22 18:31:42'),
(66, 9, 'Log in!', '2025-05-22 18:34:02'),
(67, 9, 'Log in!', '2025-05-22 18:35:09'),
(68, 2, 'Log in!', '2025-05-22 18:35:23'),
(69, 2, 'Log in!', '2025-05-22 18:38:55');

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
  `u_status` text NOT NULL,
  `u_profilepic` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_cnumber`, `u_password`, `u_type`, `u_status`, `u_profilepic`) VALUES
(1, 'Mark Joseph', 'Canedo', 'mark@sample.com', '09933981679', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', 'Admin', 'Active', ''),
(2, 'arkeen', 'larisma', 'ken@test.com', '12345678901', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Librarian', 'Active', ''),
(3, 'joseph', 'canedo', 'joseph@test.com', '12345678901', '00000000', 'Borrower', 'Pending', ''),
(4, 'nina', 'canada', 'nleigh@gmail.com', '09999999123', 'nnnnnnnn', 'Borrower', 'Active', ''),
(5, 'bogart', 'canedo', 'macky@test.com', '12345678901', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Librarian', 'Pending', ''),
(6, 'dex', 'ter', 'dexter@sample.com', '12345612345', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Borrower', 'Pending', ''),
(7, 'Gabby', 'Tai', 'gab@test.com', '11111111111', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Borrower', 'Active', 'ProfilePictures/pp3.jpg'),
(8, 'Louigie', 'Borjak', 'bor@test.com', '22222222222', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Borrower', 'Pending', ''),
(9, 'Ben', 'Tong', 'ben@test.com', '22222222222', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Borrower', 'Active', 'Profilepictures/defaultpp.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`b_id`);

--
-- Indexes for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  ADD PRIMARY KEY (`lb_id`),
  ADD KEY `id` (`u_id`),
  ADD KEY `b_id` (`b_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `b_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  MODIFY `lb_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `l_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `loanedbooks_tbl`
--
ALTER TABLE `loanedbooks_tbl`
  ADD CONSTRAINT `b_id` FOREIGN KEY (`b_id`) REFERENCES `books` (`b_id`),
  ADD CONSTRAINT `id` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `u_id` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
