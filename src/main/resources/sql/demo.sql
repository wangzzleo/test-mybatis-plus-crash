CREATE TABLE `zz_test` (
   `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
   `test` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   `test_varchar` varchar(11) NOT NULL DEFAULT '123123',
   PRIMARY KEY (`id`)
);