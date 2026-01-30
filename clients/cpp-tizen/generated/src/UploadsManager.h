#ifndef _UploadsManager_H_
#define _UploadsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CompleteUploadRequest.h"
#include "CreateUploadRequest.h"
#include "Upload.h"
#include "UploadPart.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Uploads Uploads
 * \ingroup Operations
 *  @{
 */
class UploadsManager {
public:
	UploadsManager();
	virtual ~UploadsManager();

/*! \brief Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). . *Synchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param data The chunk of bytes for this Part.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addUploadPartSync(char * accessToken,
	std::string uploadId, std::string data, 
	void(* handler)(UploadPart, Error, void* )
	, void* userData);

/*! \brief Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). . *Asynchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param data The chunk of bytes for this Part.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addUploadPartAsync(char * accessToken,
	std::string uploadId, std::string data, 
	void(* handler)(UploadPart, Error, void* )
	, void* userData);


/*! \brief Cancels the Upload. No Parts may be added after an Upload is cancelled. . *Synchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelUploadSync(char * accessToken,
	std::string uploadId, 
	void(* handler)(Upload, Error, void* )
	, void* userData);

/*! \brief Cancels the Upload. No Parts may be added after an Upload is cancelled. . *Asynchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelUploadAsync(char * accessToken,
	std::string uploadId, 
	void(* handler)(Upload, Error, void* )
	, void* userData);


/*! \brief Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. . *Synchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param completeUploadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool completeUploadSync(char * accessToken,
	std::string uploadId, std::shared_ptr<CompleteUploadRequest> completeUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData);

/*! \brief Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. . *Asynchronous*
 *
 * 
 * \param uploadId The ID of the Upload.  *Required*
 * \param completeUploadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool completeUploadAsync(char * accessToken,
	std::string uploadId, std::shared_ptr<CompleteUploadRequest> completeUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData);


/*! \brief Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). . *Synchronous*
 *
 * 
 * \param createUploadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUploadSync(char * accessToken,
	std::shared_ptr<CreateUploadRequest> createUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData);

/*! \brief Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). . *Asynchronous*
 *
 * 
 * \param createUploadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createUploadAsync(char * accessToken,
	std::shared_ptr<CreateUploadRequest> createUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* UploadsManager_H_ */
