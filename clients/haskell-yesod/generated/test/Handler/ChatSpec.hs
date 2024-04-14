{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ChatSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postChatCompletionsR" $
        it "returns 501 Not Implemented" $ do
            post ChatCompletionsR
            statusIs 501
