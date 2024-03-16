/*
 * CreateEmbeddingRequest.h
 *
 * 
 */

#ifndef _CreateEmbeddingRequest_H_
#define _CreateEmbeddingRequest_H_


#include <string>
#include "CreateEmbeddingRequest_input.h"
#include "CreateEmbeddingRequest_model.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateEmbeddingRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingRequest();
	CreateEmbeddingRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateEmbeddingRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateEmbeddingRequest_model  model);
	/*! \brief Get 
	 */
	CreateEmbeddingRequest_input getInput();

	/*! \brief Set 
	 */
	void setInput(CreateEmbeddingRequest_input  input);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	void setUser(std::string  user);

private:
	CreateEmbeddingRequest_model model;
	CreateEmbeddingRequest_input input;
	std::string user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEmbeddingRequest_H_ */
