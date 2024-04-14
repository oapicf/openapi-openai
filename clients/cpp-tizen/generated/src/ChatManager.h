#ifndef _ChatManager_H_
#define _ChatManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateChatCompletionRequest.h"
#include "CreateChatCompletionResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Chat Chat
 * \ingroup Operations
 *  @{
 */
class ChatManager {
public:
	ChatManager();
	virtual ~ChatManager();

/*! \brief Creates a model response for the given chat conversation.. *Synchronous*
 *
 * 
 * \param createChatCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatCompletionSync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData);

/*! \brief Creates a model response for the given chat conversation.. *Asynchronous*
 *
 * 
 * \param createChatCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatCompletionAsync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* ChatManager_H_ */
