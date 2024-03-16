/*
 * CreateEmbeddingResponse_data_inner.h
 *
 * 
 */

#ifndef _CreateEmbeddingResponse_data_inner_H_
#define _CreateEmbeddingResponse_data_inner_H_


#include <string>
#include <list>
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

class CreateEmbeddingResponse_data_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingResponse_data_inner();
	CreateEmbeddingResponse_data_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingResponse_data_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<long long> getEmbedding();

	/*! \brief Set 
	 */
	void setEmbedding(std::list <long long> embedding);

private:
	int index;
	std::string object;
	std::list <long long>embedding;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEmbeddingResponse_data_inner_H_ */
