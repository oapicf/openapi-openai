package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/Assistants-report-json/Assistants.json",
 "json:./report/Audio-report-json/Audio.json",
 "json:./report/Chat-report-json/Chat.json",
 "json:./report/Completions-report-json/Completions.json",
 "json:./report/Embeddings-report-json/Embeddings.json",
 "json:./report/Fine-tuning-report-json/Fine-tuning.json",
 "json:./report/Batch-report-json/Batch.json",
 "json:./report/Files-report-json/Files.json",
 "json:./report/Uploads-report-json/Uploads.json",
 "json:./report/Images-report-json/Images.json",
 "json:./report/Models-report-json/Models.json",
 "json:./report/Moderations-report-json/Moderations.json",
 "json:./report/Audit Logs-report-json/Audit Logs.json",
 })
public class PkmstTest {
}