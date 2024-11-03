{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CompletionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCompletionsR" $
        it "returns 501 Not Implemented" $ do
            post CompletionsR
            statusIs 501
