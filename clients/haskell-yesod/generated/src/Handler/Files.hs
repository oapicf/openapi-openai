{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Files where

import           Import


-- | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
--
-- operationId: createFile
postFilesR :: Handler Value
postFilesR = notImplemented

-- | Delete a file.
--
-- operationId: deleteFile
deleteFilesByTextR :: Text -- ^ The ID of the file to use for this request.
                   -> Handler Value
deleteFilesByTextR fileId = notImplemented

-- | Returns the contents of the specified file.
--
-- operationId: downloadFile
getFilesByTextContentR :: Text -- ^ The ID of the file to use for this request.
                       -> Handler Value
getFilesByTextContentR fileId = notImplemented

-- | Returns a list of files that belong to the user&#39;s organization.
--
-- operationId: listFiles
getFilesR :: Handler Value
getFilesR = notImplemented

-- | Returns information about a specific file.
--
-- operationId: retrieveFile
getFilesByTextR :: Text -- ^ The ID of the file to use for this request.
                -> Handler Value
getFilesByTextR fileId = notImplemented
