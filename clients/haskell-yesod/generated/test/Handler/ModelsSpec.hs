{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ModelsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteModelsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ ModelsByTextR "ft:gpt-4o-mini:acemeco:suffix:abc123"
            statusIs 501

    describe "getModelsR" $
        it "returns 501 Not Implemented" $ do
            get ModelsR
            statusIs 501

    describe "getModelsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ ModelsByTextR "gpt-4o-mini"
            statusIs 501
