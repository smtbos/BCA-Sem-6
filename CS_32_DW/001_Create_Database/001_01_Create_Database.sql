USE master
GO

if DB_ID('KSC_5038DW') IS NOT NULL
	DROP DATABASE KSC_5038DW;
GO

CREATE DATABASE KSC_5038DW;
GO