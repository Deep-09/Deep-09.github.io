-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2017 at 03:43 AM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `test2`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `DeptNo` int(11) NOT NULL,
  `Dname` varchar(20) NOT NULL,
  `Location` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DeptNo`, `Dname`, `Location`) VALUES
(101, 'Coding', 'Hinjewadi'),
(102, 'Testng', 'Baner'),
(103, 'Design', 'Koregaon Park');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `EmpNo` int(11) NOT NULL,
  `Ename` varchar(20) NOT NULL,
  `Job` varchar(20) NOT NULL,
  `MGR` varchar(20) NOT NULL,
  `Hiredate` date NOT NULL,
  `Salary` int(11) NOT NULL,
  `DeptNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpNo`, `Ename`, `Job`, `MGR`, `Hiredate`, `Salary`, `DeptNo`) VALUES
(201, 'Deepak', 'Java', 'Satish', '2017-04-15', 20000, 101),
(202, 'Mahesh', 'Manual Testing', 'Satish', '2017-01-12', 18000, 102),
(203, 'Ravi', 'Use Case Diagram', 'Satish', '2017-03-15', 28000, 103);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
 ADD PRIMARY KEY (`DeptNo`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
 ADD PRIMARY KEY (`EmpNo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
