/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing EmbeddingsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class EmbeddingsApiTests : IDisposable
    {
        private EmbeddingsApi instance;

        public EmbeddingsApiTests()
        {
            instance = new EmbeddingsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of EmbeddingsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' EmbeddingsApi
            //Assert.IsType<EmbeddingsApi>(instance);
        }

        /// <summary>
        /// Test CreateEmbedding
        /// </summary>
        [Fact]
        public void CreateEmbeddingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CreateEmbeddingRequest createEmbeddingRequest = null;
            //var response = instance.CreateEmbedding(createEmbeddingRequest);
            //Assert.IsType<CreateEmbeddingResponse>(response);
        }
    }
}
