{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.VectorStoresSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postVectorStoresByTextFileBatchesByTextCancelR" $
        it "returns 501 Not Implemented" $ do
            post $ VectorStoresByTextFileBatchesByTextCancelR "vectorStoreId_example" "batchId_example"
            statusIs 501

    describe "postVectorStoresR" $
        it "returns 501 Not Implemented" $ do
            post VectorStoresR
            statusIs 501

    describe "postVectorStoresByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            post $ VectorStoresByTextFilesR "vs_abc123"
            statusIs 501

    describe "postVectorStoresByTextFileBatchesR" $
        it "returns 501 Not Implemented" $ do
            post $ VectorStoresByTextFileBatchesR "vs_abc123"
            statusIs 501

    describe "deleteVectorStoresByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ VectorStoresByTextR "vectorStoreId_example"
            statusIs 501

    describe "deleteVectorStoresByTextFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ VectorStoresByTextFilesByTextR "vectorStoreId_example" "fileId_example"
            statusIs 501

    describe "getVectorStoresByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ VectorStoresByTextR "vectorStoreId_example"
            statusIs 501

    describe "getVectorStoresByTextFilesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ VectorStoresByTextFilesByTextR "vs_abc123" "file-abc123"
            statusIs 501

    describe "getVectorStoresByTextFileBatchesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ VectorStoresByTextFileBatchesByTextR "vs_abc123" "vsfb_abc123"
            statusIs 501

    describe "getVectorStoresByTextFileBatchesByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            get $ VectorStoresByTextFileBatchesByTextFilesR "vectorStoreId_example" "batchId_example"
            statusIs 501

    describe "getVectorStoresByTextFilesR" $
        it "returns 501 Not Implemented" $ do
            get $ VectorStoresByTextFilesR "vectorStoreId_example"
            statusIs 501

    describe "getVectorStoresR" $
        it "returns 501 Not Implemented" $ do
            get VectorStoresR
            statusIs 501

    describe "postVectorStoresByTextR" $
        it "returns 501 Not Implemented" $ do
            post $ VectorStoresByTextR "vectorStoreId_example"
            statusIs 501
