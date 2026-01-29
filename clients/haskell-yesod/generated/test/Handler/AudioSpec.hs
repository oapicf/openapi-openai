{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.AudioSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAudioSpeechR" $
        it "returns 501 Not Implemented" $ do
            post AudioSpeechR
            statusIs 501

    describe "postAudioTranscriptionsR" $
        it "returns 501 Not Implemented" $ do
            post AudioTranscriptionsR
            statusIs 501

    describe "postAudioTranslationsR" $
        it "returns 501 Not Implemented" $ do
            post AudioTranslationsR
            statusIs 501
