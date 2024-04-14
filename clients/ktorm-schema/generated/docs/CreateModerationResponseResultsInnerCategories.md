
# Table `CreateModerationResponse_results_inner_categories`
(mapped from: CreateModerationResponseResultsInnerCategories)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hate** | hate | boolean NOT NULL |  | **kotlin.Boolean** | Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. | 
**hateThreatening** | hatethreatening | boolean NOT NULL |  | **kotlin.Boolean** | Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. | 
**harassment** | harassment | boolean NOT NULL |  | **kotlin.Boolean** | Content that expresses, incites, or promotes harassing language towards any target. | 
**harassmentThreatening** | harassmentthreatening | boolean NOT NULL |  | **kotlin.Boolean** | Harassment content that also includes violence or serious harm towards any target. | 
**selfHarm** | selfharm | boolean NOT NULL |  | **kotlin.Boolean** | Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. | 
**selfHarmIntent** | selfharmintent | boolean NOT NULL |  | **kotlin.Boolean** | Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. | 
**selfHarmInstructions** | selfharminstructions | boolean NOT NULL |  | **kotlin.Boolean** | Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. | 
**sexual** | sexual | boolean NOT NULL |  | **kotlin.Boolean** | Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). | 
**sexualMinors** | sexualminors | boolean NOT NULL |  | **kotlin.Boolean** | Sexual content that includes an individual who is under 18 years old. | 
**violence** | violence | boolean NOT NULL |  | **kotlin.Boolean** | Content that depicts death, violence, or physical injury. | 
**violenceGraphic** | violencegraphic | boolean NOT NULL |  | **kotlin.Boolean** | Content that depicts death, violence, or physical injury in graphic detail. | 













