#ifndef _CompletionsManager_H_
#define _CompletionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateCompletionRequest.h"
#include "CreateCompletionResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Completions Completions
 * \ingroup Operations
 *  @{
 */
class CompletionsManager {
public:
	CompletionsManager();
	virtual ~CompletionsManager();

/*! \brief Creates a completion for the provided prompt and parameters.. *Synchronous*
 *
 * 
 * \param createCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCompletionSync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData);

/*! \brief Creates a completion for the provided prompt and parameters.. *Asynchronous*
 *
 * 
 * \param createCompletionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createCompletionAsync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* CompletionsManager_H_ */
