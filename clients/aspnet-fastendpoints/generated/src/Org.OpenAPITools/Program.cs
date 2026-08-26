using FastEndpoints;
using FastEndpoints.Swagger;

var builder = WebApplication.CreateBuilder(args);

builder.Services
    
    .AddFastEndpoints()
    .SwaggerDocument(o =>
    {
        o.DocumentSettings = s =>
        {
            s.DocumentName = "OpenAI API";
            s.Title = "OpenAI API";
            s.Description = """
The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
""";
            s.Version = "2.3.0";
        };
        o.AutoTagPathSegmentIndex = 0;
    })
    
;

var app = builder.Build();

app
    
    .UseFastEndpoints(x =>
    {
        
    })
    .UseSwaggerGen();

app.UseHttpsRedirection();

app.Run();