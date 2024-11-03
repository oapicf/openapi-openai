/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.CreateModerationResponseResultsInnerCategories

class CreateModerationResponseResultsInnerCategoriesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateModerationResponseResultsInnerCategories
        //val modelInstance = CreateModerationResponseResultsInnerCategories()

        // to test the property `hate` - Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
        should("test hate") {
            // uncomment below to test the property
            //modelInstance.hate shouldBe ("TODO")
        }

        // to test the property `hateThreatening` - Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
        should("test hateThreatening") {
            // uncomment below to test the property
            //modelInstance.hateThreatening shouldBe ("TODO")
        }

        // to test the property `harassment` - Content that expresses, incites, or promotes harassing language towards any target.
        should("test harassment") {
            // uncomment below to test the property
            //modelInstance.harassment shouldBe ("TODO")
        }

        // to test the property `harassmentThreatening` - Harassment content that also includes violence or serious harm towards any target.
        should("test harassmentThreatening") {
            // uncomment below to test the property
            //modelInstance.harassmentThreatening shouldBe ("TODO")
        }

        // to test the property `selfHarm` - Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
        should("test selfHarm") {
            // uncomment below to test the property
            //modelInstance.selfHarm shouldBe ("TODO")
        }

        // to test the property `selfHarmIntent` - Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
        should("test selfHarmIntent") {
            // uncomment below to test the property
            //modelInstance.selfHarmIntent shouldBe ("TODO")
        }

        // to test the property `selfHarmInstructions` - Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
        should("test selfHarmInstructions") {
            // uncomment below to test the property
            //modelInstance.selfHarmInstructions shouldBe ("TODO")
        }

        // to test the property `sexual` - Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
        should("test sexual") {
            // uncomment below to test the property
            //modelInstance.sexual shouldBe ("TODO")
        }

        // to test the property `sexualMinors` - Sexual content that includes an individual who is under 18 years old.
        should("test sexualMinors") {
            // uncomment below to test the property
            //modelInstance.sexualMinors shouldBe ("TODO")
        }

        // to test the property `violence` - Content that depicts death, violence, or physical injury.
        should("test violence") {
            // uncomment below to test the property
            //modelInstance.violence shouldBe ("TODO")
        }

        // to test the property `violenceGraphic` - Content that depicts death, violence, or physical injury in graphic detail.
        should("test violenceGraphic") {
            // uncomment below to test the property
            //modelInstance.violenceGraphic shouldBe ("TODO")
        }

    }
}
