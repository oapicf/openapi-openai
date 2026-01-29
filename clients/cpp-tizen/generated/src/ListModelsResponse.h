/*
 * ListModelsResponse.h
 *
 * 
 */

#ifndef _ListModelsResponse_H_
#define _ListModelsResponse_H_


#include <string>
#include "Model.h"
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

class ListModelsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListModelsResponse();
	ListModelsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListModelsResponse();

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
	std::list<Model> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Model> data);

private:
	std::string object;
	std::list <Model>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListModelsResponse_H_ */
