#ifndef _FilesManager_H_
#define _FilesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "DeleteFileResponse.h"
#include "ListFilesResponse.h"
#include "OpenAIFile.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Files Files
 * \ingroup Operations
 *  @{
 */
class FilesManager {
public:
	FilesManager();
	virtual ~FilesManager();

/*! \brief Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. . *Synchronous*
 *
 * 
 * \param file The File object (not file name) to be uploaded.  *Required*
 * \param purpose The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning).  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFileSync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);

/*! \brief Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. . *Asynchronous*
 *
 * 
 * \param file The File object (not file name) to be uploaded.  *Required*
 * \param purpose The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning).  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFileAsync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);


/*! \brief Delete a file.. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData);

/*! \brief Delete a file.. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData);


/*! \brief Returns the contents of the specified file.. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Returns the contents of the specified file.. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Returns a list of files.. *Synchronous*
 *
 * 
 * \param purpose Only return files with the given purpose.
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesSync(char * accessToken,
	std::string purpose, int limit, std::string order, std::string after, 
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of files.. *Asynchronous*
 *
 * 
 * \param purpose Only return files with the given purpose.
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesAsync(char * accessToken,
	std::string purpose, int limit, std::string order, std::string after, 
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData);


/*! \brief Returns information about a specific file.. *Synchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);

/*! \brief Returns information about a specific file.. *Asynchronous*
 *
 * 
 * \param fileId The ID of the file to use for this request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* FilesManager_H_ */
