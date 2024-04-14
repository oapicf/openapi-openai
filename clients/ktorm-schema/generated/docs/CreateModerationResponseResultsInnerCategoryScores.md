
# Table `CreateModerationResponse_results_inner_category_scores`
(mapped from: CreateModerationResponseResultsInnerCategoryScores)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hate** | hate | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;hate&#39;. | 
**hateThreatening** | hatethreatening | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;hate/threatening&#39;. | 
**harassment** | harassment | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;harassment&#39;. | 
**harassmentThreatening** | harassmentthreatening | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;harassment/threatening&#39;. | 
**selfHarm** | selfharm | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;self-harm&#39;. | 
**selfHarmIntent** | selfharmintent | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;self-harm/intent&#39;. | 
**selfHarmInstructions** | selfharminstructions | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;self-harm/instructions&#39;. | 
**sexual** | sexual | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;sexual&#39;. | 
**sexualMinors** | sexualminors | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;sexual/minors&#39;. | 
**violence** | violence | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;violence&#39;. | 
**violenceGraphic** | violencegraphic | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The score for the category &#39;violence/graphic&#39;. | 













