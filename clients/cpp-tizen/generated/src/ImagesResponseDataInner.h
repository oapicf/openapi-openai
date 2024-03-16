/*
 * ImagesResponse_data_inner.h
 *
 * 
 */

#ifndef _ImagesResponse_data_inner_H_
#define _ImagesResponse_data_inner_H_


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

class ImagesResponse_data_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ImagesResponse_data_inner();
	ImagesResponse_data_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ImagesResponse_data_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get 
	 */
	std::string getB64Json();

	/*! \brief Set 
	 */
	void setB64Json(std::string  b64_json);

private:
	std::string url;
	std::string b64_json;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ImagesResponse_data_inner_H_ */
