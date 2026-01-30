{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.VectorStores where

import           Import


-- | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
--
-- operationId: cancelVectorStoreFileBatch
postVectorStoresByTextFileBatchesByTextCancelR :: Text -- ^ The ID of the vector store that the file batch belongs to.
                                               -> Text -- ^ The ID of the file batch to cancel.
                                               -> Handler Value
postVectorStoresByTextFileBatchesByTextCancelR vectorStoreId batchId = notImplemented

-- | Create a vector store.
--
-- operationId: createVectorStore
postVectorStoresR :: Handler Value
postVectorStoresR = notImplemented

-- | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
--
-- operationId: createVectorStoreFile
postVectorStoresByTextFilesR :: Text -- ^ The ID of the vector store for which to create a File. 
                             -> Handler Value
postVectorStoresByTextFilesR vectorStoreId = notImplemented

-- | Create a vector store file batch.
--
-- operationId: createVectorStoreFileBatch
postVectorStoresByTextFileBatchesR :: Text -- ^ The ID of the vector store for which to create a File Batch. 
                                   -> Handler Value
postVectorStoresByTextFileBatchesR vectorStoreId = notImplemented

-- | Delete a vector store.
--
-- operationId: deleteVectorStore
deleteVectorStoresByTextR :: Text -- ^ The ID of the vector store to delete.
                          -> Handler Value
deleteVectorStoresByTextR vectorStoreId = notImplemented

-- | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
--
-- operationId: deleteVectorStoreFile
deleteVectorStoresByTextFilesByTextR :: Text -- ^ The ID of the vector store that the file belongs to.
                                     -> Text -- ^ The ID of the file to delete.
                                     -> Handler Value
deleteVectorStoresByTextFilesByTextR vectorStoreId fileId = notImplemented

-- | Retrieves a vector store.
--
-- operationId: getVectorStore
getVectorStoresByTextR :: Text -- ^ The ID of the vector store to retrieve.
                       -> Handler Value
getVectorStoresByTextR vectorStoreId = notImplemented

-- | Retrieves a vector store file.
--
-- operationId: getVectorStoreFile
getVectorStoresByTextFilesByTextR :: Text -- ^ The ID of the vector store that the file belongs to.
                                  -> Text -- ^ The ID of the file being retrieved.
                                  -> Handler Value
getVectorStoresByTextFilesByTextR vectorStoreId fileId = notImplemented

-- | Retrieves a vector store file batch.
--
-- operationId: getVectorStoreFileBatch
getVectorStoresByTextFileBatchesByTextR :: Text -- ^ The ID of the vector store that the file batch belongs to.
                                        -> Text -- ^ The ID of the file batch being retrieved.
                                        -> Handler Value
getVectorStoresByTextFileBatchesByTextR vectorStoreId batchId = notImplemented

-- | Returns a list of vector store files in a batch.
--
-- operationId: listFilesInVectorStoreBatch
getVectorStoresByTextFileBatchesByTextFilesR :: Text -- ^ The ID of the vector store that the files belong to.
                                             -> Text -- ^ The ID of the file batch that the files belong to.
                                             -> Handler Value
getVectorStoresByTextFileBatchesByTextFilesR vectorStoreId batchId = notImplemented

-- | Returns a list of vector store files.
--
-- operationId: listVectorStoreFiles
getVectorStoresByTextFilesR :: Text -- ^ The ID of the vector store that the files belong to.
                            -> Handler Value
getVectorStoresByTextFilesR vectorStoreId = notImplemented

-- | Returns a list of vector stores.
--
-- operationId: listVectorStores
getVectorStoresR :: Handler Value
getVectorStoresR = notImplemented

-- | Modifies a vector store.
--
-- operationId: modifyVectorStore
postVectorStoresByTextR :: Text -- ^ The ID of the vector store to modify.
                        -> Handler Value
postVectorStoresByTextR vectorStoreId = notImplemented
