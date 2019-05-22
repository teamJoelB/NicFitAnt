-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 22 Mai 2019 à 15:31
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `mydb`
--
CREATE DATABASE IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `mydb`;

-- --------------------------------------------------------

--
-- Structure de la table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
  `id_Log` int(11) NOT NULL AUTO_INCREMENT,
  `date_Deconnexion` datetime DEFAULT CURRENT_TIMESTAMP,
  `User_id_User` int(11) NOT NULL,
  PRIMARY KEY (`id_Log`),
  KEY `fk_Log_User1_idx` (`User_id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `objectif`
--

CREATE TABLE IF NOT EXISTS `objectif` (
  `id_Objectif` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(200) NOT NULL,
  `categorie` varchar(50) NOT NULL,
  `valeur_Max` int(11) NOT NULL,
  `valeur_Actuelle` int(11) DEFAULT NULL,
  `echeance` datetime DEFAULT NULL,
  `User_id_User` int(11) NOT NULL,
  PRIMARY KEY (`id_Objectif`),
  KEY `fk_Objectif_User1_idx` (`User_id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `poids`
--

CREATE TABLE IF NOT EXISTS `poids` (
  `id_Poids` int(11) NOT NULL AUTO_INCREMENT,
  `val_Poids` int(11) DEFAULT NULL,
  `date_Modification` datetime DEFAULT CURRENT_TIMESTAMP,
  `User_id_User` int(11) NOT NULL,
  PRIMARY KEY (`id_Poids`),
  KEY `fk_Poids_User1_idx` (`User_id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_User` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `sexe` varchar(10) DEFAULT NULL,
  `taille` decimal(2,0) DEFAULT NULL,
  `mail` varchar(100) NOT NULL,
  `login` varchar(100) NOT NULL,
  `mdp` varchar(100) NOT NULL,
  PRIMARY KEY (`id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `log`
--
ALTER TABLE `log`
  ADD CONSTRAINT `fk_Log_User1` FOREIGN KEY (`User_id_User`) REFERENCES `user` (`id_User`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `objectif`
--
ALTER TABLE `objectif`
  ADD CONSTRAINT `fk_Objectif_User1` FOREIGN KEY (`User_id_User`) REFERENCES `user` (`id_User`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `poids`
--
ALTER TABLE `poids`
  ADD CONSTRAINT `fk_Poids_User1` FOREIGN KEY (`User_id_User`) REFERENCES `user` (`id_User`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
