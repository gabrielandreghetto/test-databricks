// Databricks notebook source
val test = "dataset.test"

// COMMAND ----------

display(test)

// COMMAND ----------

test.withColumn("aaa", lit("bbb"))
