/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateFineTuningJobRequestIntegrationsInner {
    #[serde(rename = "type")]
    pub r#type: Box<models::CreateFineTuningJobRequestIntegrationsInnerType>,
    #[serde(rename = "wandb")]
    pub wandb: Box<models::CreateFineTuningJobRequestIntegrationsInnerWandb>,
}

impl CreateFineTuningJobRequestIntegrationsInner {
    pub fn new(r#type: models::CreateFineTuningJobRequestIntegrationsInnerType, wandb: models::CreateFineTuningJobRequestIntegrationsInnerWandb) -> CreateFineTuningJobRequestIntegrationsInner {
        CreateFineTuningJobRequestIntegrationsInner {
            r#type: Box::new(r#type),
            wandb: Box::new(wandb),
        }
    }
}

