#ifndef _EmbeddingsManager_H_
#define _EmbeddingsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateEmbeddingRequest.h"
#include "CreateEmbeddingResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Embeddings Embeddings
 * \ingroup Operations
 *  @{
 */
class EmbeddingsManager {
public:
	EmbeddingsManager();
	virtual ~EmbeddingsManager();

/*! \brief Creates an embedding vector representing the input text.. *Synchronous*
 *
 * 
 * \param createEmbeddingRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEmbeddingSync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData);

/*! \brief Creates an embedding vector representing the input text.. *Asynchronous*
 *
 * 
 * \param createEmbeddingRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createEmbeddingAsync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* EmbeddingsManager_H_ */
