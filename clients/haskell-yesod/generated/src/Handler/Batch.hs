{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Batch where

import           Import


-- | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
--
-- operationId: cancelBatch
postBatchesByTextCancelR :: Text -- ^ The ID of the batch to cancel.
                         -> Handler Value
postBatchesByTextCancelR batchId = notImplemented

-- | Creates and executes a batch from an uploaded file of requests
--
-- operationId: createBatch
postBatchesR :: Handler Value
postBatchesR = notImplemented

-- | List your organization&#39;s batches.
--
-- operationId: listBatches
getBatchesR :: Handler Value
getBatchesR = notImplemented

-- | Retrieves a batch.
--
-- operationId: retrieveBatch
getBatchesByTextR :: Text -- ^ The ID of the batch to retrieve.
                  -> Handler Value
getBatchesByTextR batchId = notImplemented
