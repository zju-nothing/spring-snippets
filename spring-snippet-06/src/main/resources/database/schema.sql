CREATE TABLE uic_bool_tag (
  account_id   BIGINT UNSIGNED NOT NULL,
  tag1         BIGINT UNSIGNED,
  tag2         BIGINT UNSIGNED,
  tag3         BIGINT UNSIGNED,
  tag4         BIGINT UNSIGNED,
  tag5         BIGINT UNSIGNED,
  tag6         BIGINT UNSIGNED,
  tag7         BIGINT UNSIGNED,
  gmt_create   DATETIME,
  gmt_modified DATETIME,
  PRIMARY KEY (account_id)
)
