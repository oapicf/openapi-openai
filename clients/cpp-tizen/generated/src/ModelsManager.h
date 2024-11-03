#ifndef _ModelsManager_H_
#define _ModelsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "DeleteModelResponse.h"
#include "ListModelsResponse.h"
#include "Model.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Models Models
 * \ingroup Operations
 *  @{
 */
class ModelsManager {
public:
	ModelsManager();
	virtual ~ModelsManager();

/*! \brief Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.. *Synchronous*
 *
 * 
 * \param model The model to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteModelSync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData);

/*! \brief Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.. *Asynchronous*
 *
 * 
 * \param model The model to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData);


/*! \brief Lists the currently available models, and provides basic information about each one such as the owner and availability.. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listModelsSync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData);

/*! \brief Lists the currently available models, and provides basic information about each one such as the owner and availability.. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listModelsAsync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData);


/*! \brief Retrieves a model instance, providing basic information about the model such as the owner and permissioning.. *Synchronous*
 *
 * 
 * \param model The ID of the model to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveModelSync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData);

/*! \brief Retrieves a model instance, providing basic information about the model such as the owner and permissioning.. *Asynchronous*
 *
 * 
 * \param model The ID of the model to use for this request *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* ModelsManager_H_ */
