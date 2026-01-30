#ifndef _ModerationsManager_H_
#define _ModerationsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateModerationRequest.h"
#include "CreateModerationResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Moderations Moderations
 * \ingroup Operations
 *  @{
 */
class ModerationsManager {
public:
	ModerationsManager();
	virtual ~ModerationsManager();

/*! \brief Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). . *Synchronous*
 *
 * 
 * \param createModerationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createModerationSync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData);

/*! \brief Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). . *Asynchronous*
 *
 * 
 * \param createModerationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createModerationAsync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* ModerationsManager_H_ */
