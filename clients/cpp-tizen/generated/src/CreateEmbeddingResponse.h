/*
 * CreateEmbeddingResponse.h
 *
 * 
 */

#ifndef _CreateEmbeddingResponse_H_
#define _CreateEmbeddingResponse_H_


#include <string>
#include "CreateEmbeddingResponse_data_inner.h"
#include "CreateEmbeddingResponse_usage.h"
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

class CreateEmbeddingResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingResponse();
	CreateEmbeddingResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getModel();

	/*! \brief Set 
	 */
	void setModel(std::string  model);
	/*! \brief Get 
	 */
	std::list<CreateEmbeddingResponse_data_inner> getData();

	/*! \brief Set 
	 */
	void setData(std::list <CreateEmbeddingResponse_data_inner> data);
	/*! \brief Get 
	 */
	CreateEmbeddingResponse_usage getUsage();

	/*! \brief Set 
	 */
	void setUsage(CreateEmbeddingResponse_usage  usage);

private:
	std::string object;
	std::string model;
	std::list <CreateEmbeddingResponse_data_inner>data;
	CreateEmbeddingResponse_usage usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEmbeddingResponse_H_ */
