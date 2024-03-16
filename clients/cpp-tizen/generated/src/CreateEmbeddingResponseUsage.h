/*
 * CreateEmbeddingResponse_usage.h
 *
 * 
 */

#ifndef _CreateEmbeddingResponse_usage_H_
#define _CreateEmbeddingResponse_usage_H_


#include <string>
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

class CreateEmbeddingResponse_usage : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingResponse_usage();
	CreateEmbeddingResponse_usage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingResponse_usage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getPromptTokens();

	/*! \brief Set 
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get 
	 */
	int getTotalTokens();

	/*! \brief Set 
	 */
	void setTotalTokens(int  total_tokens);

private:
	int prompt_tokens;
	int total_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEmbeddingResponse_usage_H_ */
