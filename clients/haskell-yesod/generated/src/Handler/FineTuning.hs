{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.FineTuning where

import           Import


-- | Immediately cancel a fine-tune job. 
--
-- operationId: cancelFineTuningJob
postFineTuningJobsByTextCancelR :: Text -- ^ The ID of the fine-tuning job to cancel. 
                                -> Handler Value
postFineTuningJobsByTextCancelR fineTuningJobId = notImplemented

-- | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
--
-- operationId: createFineTuningJob
postFineTuningJobsR :: Handler Value
postFineTuningJobsR = notImplemented

-- | Get status updates for a fine-tuning job. 
--
-- operationId: listFineTuningEvents
getFineTuningJobsByTextEventsR :: Text -- ^ The ID of the fine-tuning job to get events for. 
                               -> Handler Value
getFineTuningJobsByTextEventsR fineTuningJobId = notImplemented

-- | List checkpoints for a fine-tuning job. 
--
-- operationId: listFineTuningJobCheckpoints
getFineTuningJobsByTextCheckpointsR :: Text -- ^ The ID of the fine-tuning job to get checkpoints for. 
                                    -> Handler Value
getFineTuningJobsByTextCheckpointsR fineTuningJobId = notImplemented

-- | List your organization&#39;s fine-tuning jobs 
--
-- operationId: listPaginatedFineTuningJobs
getFineTuningJobsR :: Handler Value
getFineTuningJobsR = notImplemented

-- | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
--
-- operationId: retrieveFineTuningJob
getFineTuningJobsByTextR :: Text -- ^ The ID of the fine-tuning job. 
                         -> Handler Value
getFineTuningJobsByTextR fineTuningJobId = notImplemented
