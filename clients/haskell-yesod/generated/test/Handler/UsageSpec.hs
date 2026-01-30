{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UsageSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getOrganizationUsageAudioSpeechesR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageAudioSpeechesR
            statusIs 501

    describe "getOrganizationUsageAudioTranscriptionsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageAudioTranscriptionsR
            statusIs 501

    describe "getOrganizationUsageCodeInterpreterSessionsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageCodeInterpreterSessionsR
            statusIs 501

    describe "getOrganizationUsageCompletionsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageCompletionsR
            statusIs 501

    describe "getOrganizationCostsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationCostsR
            statusIs 501

    describe "getOrganizationUsageEmbeddingsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageEmbeddingsR
            statusIs 501

    describe "getOrganizationUsageImagesR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageImagesR
            statusIs 501

    describe "getOrganizationUsageModerationsR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageModerationsR
            statusIs 501

    describe "getOrganizationUsageVectorStoresR" $
        it "returns 501 Not Implemented" $ do
            get OrganizationUsageVectorStoresR
            statusIs 501
