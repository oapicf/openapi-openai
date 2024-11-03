{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ModelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteModelsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ ModelsByTextR "ft:gpt-3.5-turbo:acemeco:suffix:abc123"
            statusIs 501

    describe "getModelsR" $
        it "returns 501 Not Implemented" $ do
            get ModelsR
            statusIs 501

    describe "getModelsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ModelsByTextR "gpt-3.5-turbo"
            statusIs 501
