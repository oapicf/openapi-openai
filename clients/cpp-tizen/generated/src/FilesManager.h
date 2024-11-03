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

/*! \brief Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. . *Synchronous*
 *
 * 
 * \param file The File object (not file name) to be uploaded.  *Required*
 * \param purpose The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFileSync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData);

/*! \brief Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. . *Asynchronous*
 *
 * 
 * \param file The File object (not file name) to be uploaded.  *Required*
 * \param purpose The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  *Required*
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


/*! \brief Returns a list of files that belong to the user's organization.. *Synchronous*
 *
 * 
 * \param purpose Only return files with the given purpose.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesSync(char * accessToken,
	std::string purpose, 
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of files that belong to the user's organization.. *Asynchronous*
 *
 * 
 * \param purpose Only return files with the given purpose.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesAsync(char * accessToken,
	std::string purpose, 
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
